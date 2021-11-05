package jalgorithms.impl.customalgorithms.binarysum;

import jalgorithms.common.customalgorithms.CustomAlgorithm;

public class BinarySumAlgorithm implements CustomAlgorithm<String, BinarySumParams> {

    @Override
    public String run(BinarySumParams param) {

        return sumBinary(param.getBinary1(), param.getBinary2());
    }

    private static String sumBinary(String binary1, String binary2){
        if(binary1 == null && binary1.length() == 0 || binary2 == null || binary2.length() == 0) {
            return null;
        }

        String result = "";

        int numBase = 2;
        int b1Idx = binary1.length() - 1;
        int b2Idx = binary2.length() - 1;

        int carry = 0;
        while(b1Idx >= 0 || b2Idx >= 0) {
            int b1val = b1Idx >= 0 && binary1.charAt(b1Idx) == '1' ? 1 : 0;
            int b2val = b2Idx >= 0 && binary2.charAt(b2Idx) == '1' ? 1 : 0;

            int sum = b1val + b2val + carry;
            carry = 0;

            if(sum >= numBase) {
                sum = sum % numBase;
                carry = 1;
            }

            result = String.format("%d%s", sum, result);

            b1Idx --;
            b2Idx --;
        }

        if(carry > 0) {
            result = String.format("%d%s", 1, result);
        }

        return result;
    }
}
