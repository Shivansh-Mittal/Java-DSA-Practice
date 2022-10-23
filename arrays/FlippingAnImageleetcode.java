package arrays;

// leetcode - https://leetcode.com/problems/flipping-an-image/

public class FlippingAnImageleetcode {
    public static void main(String[] args) {
        
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
            int start = 0;
            int end = image[i].length - 1;
            while(start<=end){
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;

                if(image[i][start] == 1)
                    image[i][start] = 0;
                else
                    image[i][start] = 1;
                
                if(image[i][end] == 1 && start!=end)
                    image[i][end] = 0;
                else if(image[i][end] == 0 && start!=end)
                    image[i][end] = 1;

                start++;
                end--;
            }
        }
        return image;
    }
}
