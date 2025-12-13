import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CouponCodeValidator {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<Integer> ans = new ArrayList<>();
        Set<String> allowedBusinessLines = Set.of("electronics", "grocery", "pharmacy", "restaurant");

        for(int i=0; i<code.length; i++){
            if(isValidCoupon(code[i]) && allowedBusinessLines.contains(businessLine[i]) && isActive[i] == true){
                ans.add(i);
            }
        }
        ans.sort((i1, i2) -> {
            int cmp = businessLine[i1].compareTo(businessLine[i2]);
            return cmp != 0 ? cmp : code[i1].compareTo(code[i2]);
        });
        
        List<String> result = new ArrayList<>();
        for (int idx : ans) {
            result.add(code[idx]);
        }
        return result;
    }

    private boolean isValidCoupon(String couponCode) {
        if (couponCode == null || couponCode.isEmpty()) {
            return false;
        }
        for (char c : couponCode.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }
        return true;
    }
}
