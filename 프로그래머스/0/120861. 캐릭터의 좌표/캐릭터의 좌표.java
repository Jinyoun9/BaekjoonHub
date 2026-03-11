class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        
        int maxX = board[0] / 2;
        int minX = -board[0] / 2;
        int maxY = board[1] / 2;
        int minY = -board[1] / 2;
        
        for(String key : keyinput) {
            if(key.equals("up") && canMove(maxY, minY, answer[1]+1)) {
                answer[1]++;
            }
            if(key.equals("down") && canMove(maxY, minY, answer[1]-1)) {
                answer[1]--;
            }
            if(key.equals("left") && canMove(maxX, minX, answer[0]-1)) {
                answer[0]--;
            }
            if(key.equals("right") && canMove(maxX, minX, answer[0]+1)) {
                answer[0]++;
            }
        }
        return answer;
    }
    
    private boolean canMove(int maxPos, int minPos, int current) {
        return minPos <= current && maxPos >= current ? true : false;
    }
}