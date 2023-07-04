package me.whiteship.java8to17;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Optional {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", true));

        OnlineClass spring_boot = new OnlineClass(1, "spring boot", true);
        // NullPointerException
//        Duration studyDuration = spring_boot.getProgress().getStudyDuration();
//        System.out.println(studyDuration);

        // null check
//        Progress progress = spring_boot.getProgress();
//        if (progress != null) {
//            System.out.println(progress.getStudyDuration());
//        }

        java.util.Optional<OnlineClass> optional =  springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        boolean present = optional.isPresent();
        System.out.println(present);

        // isPresent check. 다른 함수 이용해서 꺼내기
//        OnlineClass onlineClass = optional.get();

        // orElse 없으면 ~를 리턴. 연산은 무조건 함
        OnlineClass onlineClass = optional.orElse(createNewClass());

        // orElseGet 없으면 새로 만들어서 리턴
        OnlineClass onlineClass2 = optional.orElseGet(Optional::createNewClass);

        // orElseThrow 없으면 error 던짐
        OnlineClass onlineClass3 = optional.orElseThrow(IllegalStateException::new);

        // filter
        java.util.Optional<OnlineClass> onlineClass4 = optional.filter(oc -> oc.isClosed());

        // flatMap
        java.util.Optional<Progress> progress = optional.flatMap(OnlineClass::getProgress);

        java.util.Optional<java.util.Optional<Progress>> progress1 = optional.map(OnlineClass::getProgress);
        java.util.Optional<Progress> progress2 = progress1.orElse(java.util.Optional.empty());
    }

    private static OnlineClass createNewClass() {
        return new OnlineClass(10, "New class", false);
    }
}
