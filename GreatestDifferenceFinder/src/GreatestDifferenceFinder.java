public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        // 파라미터로 정수 배열 intArray를 받고, 두 원소의 차이 중 가장 큰 값을 리턴해주는 메소드 greatestDifference를 쓰세요. 리턴값의 자료형은 int입니다.
        //
        //만약 원소 개수가 2개보다 작으면 0을 리턴해줍니다.

        if (intArray.length < 2) {
            return 0;

        }
        int max = intArray[0];
        int min = intArray[0];

        for (int i = 0; i < intArray.length; i++) {
            // 배열의 원소가 max보다 클 경우, max로 해당 값으로 업데이트
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
        for (int i = 0; i < intArray.length; i++) {

            if (min > intArray[i]) {
                min = intArray[i];
            }
        }

        return max-min;

    }
}