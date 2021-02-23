package Basic;

public class ForLoops {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 4 ,5};
        int cnt = 0;
        for(int element:arr)
        {
            System.out.println(element);
            cnt += element;
        }

        System.out.print("total: ");
        System.out.println(cnt);
    }
}
