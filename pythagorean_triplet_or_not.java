public class pythagorean_triplet_or_not {
    public static void main(String[] args) {
        int a=2,b=2,c=5;
        if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==b*b+a*a){
            System.out.println("Triangle is pythagorean triplet");

        }else{
            System.out.println("Triangle is NOT pythagorean triplet");
        }
    }
}
