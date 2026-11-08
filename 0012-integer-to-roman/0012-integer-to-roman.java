class Solution {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        while(num > 0){
            if(num >= 900 && num < 1000){
                result.append("CM");
                num -= 900;
            }
            if(num >= 400 && num < 500){
                result.append("CD");
                num -= 400;
            }
            if(num >= 90 && num < 100){
                result.append("XC");
                num -= 90;
            }
            if(num >= 40 && num < 50){
                result.append("XL");
                num -= 40;
            }
            if(num == 9){
                result.append("IX");
                num -= 9;
            }
            if(num == 4){
                result.append("IV");
                num -= 4;
            }
            if(num >= 1000){
                result.append("M");
                num -= 1000;
            }
            else if(num >= 500){
                result.append("D");
                num -= 500;
            }
            else if(num >= 100){
                result.append("C");
                num -= 100;
            }
            else if(num >= 50){
                result.append("L");
                num -= 50;
            }else if(num >= 10 && num <= 50){
                result.append("X");
                num -= 10;
            }else if(num >=5){
                result.append("V");
                num -= 5;
            }else if(num >= 1 && num <= 3){
                result.append("I");
                num -= 1;
            }
        }
        return result.toString();
    }
}