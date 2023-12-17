package dataClass;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];//배열 생성

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title= "어바웃타임";
        aboutTime.review ="인생 시간 영화!";
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {//배열에서 꺼내기
            System.out.println(review.title+review.review);

        }

        System.out.println("영화제목 = " + inception.title+"리뷰:"+inception.review);
        System.out.println("영화제목 = " + aboutTime.title+"리뷰:"+aboutTime.review);

    }
}
