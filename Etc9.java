package mydolist;

public class Etc9 {
   public static void main(String[] args) {
         int[] numArr = new int[10];
         
         for(int i=0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random()* 10));
         }
         System.out.println();
         
         for(int i=0; i< numArr.length-1; i++) {
            
            // 자리바꿈이 발생했는지를 체크한다.
            // boolean은 true, false로 체크
            boolean changed = false;
            // numArr.length : numArr의 길이갯수
            for(int j=0; j< numArr.length-1-i; j++) {
               if(numArr[j] > numArr[j+1]) {
                  // 옆의 값이 작으면 서로 바꾼다.
                  // 서로 자리바꾸는 코드인데 변수 선언하는 방식으로 생각하면 이해하기 편하다.
                  int temp = numArr[j];
                  numArr[j] = numArr[j+1];
                  numArr[j+1] = temp;
                  // 자리바꿈이 발생했으니 changed를 true로 선언한다.
                  changed = true;
               }
            }
            // 자리바꿈이 없으면 반복문을 벗어난다.
            if(!changed) break;
            
            for(int k=0; k<numArr.length; k++) {
               // 정렬된 결과를 출력한다.
               System.out.println(numArr[k]);
            }
            System.out.println();

         }

   }
}
