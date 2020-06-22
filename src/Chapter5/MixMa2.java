package Chapter5;

public class MixMa2 {
    public static void main(String[] args) {
        int nums[] = {99,-10,1234545,18,121,-98,8, -25, 28};
        int min, max;

        min = max = nums[0];
        for (int i=1; i <10 ; i++){
            if (nums[i] < min  )  min = nums[i];
            if (nums[i] < max ) max = nums[i];
        }

        System.out.println("min and max  " + min + "max " + max);
    }
}
