// import java.util.*;


//Uses 8ms....

// class Solution {
//     public int romanToInt(String s) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         map.put('I', 1);
//         map.put('V', 5);
//         map.put('X', 10);
//         map.put('L', 50);
//         map.put('C', 100);
//         map.put('D', 500);
//         map.put('M', 1000);

//         int sum = 0;

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (i < s.length() - 1 && ch == 'I' && s.charAt(i + 1) == 'V') {
//                 sum += 4;
//                 i++;
//             }
//             else if (i < s.length() - 1 && ch == 'I' && s.charAt(i + 1) == 'X') {
//                 sum += 9;
//                 i++;
//             }
//             else if (i < s.length() - 1 && ch == 'X' && s.charAt(i + 1) == 'L') {
//                 sum += 40;
//                 i++;
//             }
//             else if (i < s.length() - 1 && ch == 'X' && s.charAt(i + 1) == 'C') {
//                 sum += 90;
//                 i++;
//             }
//             else if (i < s.length() - 1 && ch == 'C' && s.charAt(i + 1) == 'D') {
//                 sum += 400;
//                 i++;
//             }
//             else if (i < s.length() - 1 && ch == 'C' && s.charAt(i + 1) == 'M') {
//                 sum += 900;
//                 i++;
//             }
//             else {
//                 sum += map.get(ch);
//             }
//         }

//         return sum;
//     }
// }



import java.util.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(i < s.length()-1 && map.get(ch) < map.get(s.charAt(i+1))) {
                sum -= map.get(ch);
            } else {
                sum += map.get(ch);
            }
        }

        return sum;
    }
}