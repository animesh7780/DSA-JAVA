import java.util.HashMap;
import java.util.Map;

public class ContainsDupliIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if(valueDiff < 0 || indexDiff <= 0) return false;

        Map<Long, Long> buckets = new HashMap<>();
        Long width = (long) valueDiff + 1;

        for(int i=0; i<nums.length; i++){
            long num = (long) nums[i];
            long bucketId = num >= 0 ? num/width : ((num + 1) / width) - 1;

            // Current bucket
            if (buckets.containsKey(bucketId)) return true;

            // Adjacent bucket: previous
            if (buckets.containsKey(bucketId - 1) && Math.abs(num - buckets.get(bucketId - 1)) < width) return true;

            // Adjacent bucket: next
            if (buckets.containsKey(bucketId + 1) && Math.abs(num - buckets.get(bucketId + 1)) < width) return true;

            buckets.put(bucketId, num);

            // Remove element outside sliding window
            if (i >= indexDiff) {
                long oldNum = (long) nums[i - indexDiff];
                long oldBucketId = oldNum >= 0 ? oldNum / width : ((oldNum + 1) / width) - 1;
                buckets.remove(oldBucketId);
            }
        }
        return false;
    }
}
