package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {
// 위임만 하는 것을 굳이 만들 필요가 있을까에 대한 고민
    private final ItemRepository itemRepository;

    @Transactional // 우선
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    @Transactional
    public Item updateItem(Long itemId, int price, String name, int stock) {
        Item findItem = itemRepository.fineOne(itemId);
        // set -> change() 같은 의미있는 메서드로 만들어서 넣어야 좋다
        findItem.setPrice(price);
        findItem.setName(name);
        findItem.setStockQuantity(stock);
        // itemRepository.save or merge 호출할 필요 없음
        // Transactional 이 commit 됨
        // flush 변경된 애 찾음
        return findItem;
    }
    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    public Item findOne(Long itemId) {
        return itemRepository.fineOne(itemId);
    }
}
