package com.example.restaurant1.wishlist.repository;

import com.example.restaurant1.db.MemoryDbRepositoryAbstract;
import com.example.restaurant1.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository // 데이터를 저장하는 곳이다
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
