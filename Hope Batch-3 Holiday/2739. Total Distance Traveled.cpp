class Solution {
public:
    int distanceTraveled(int mainTank, int additionalTank) {
        int distanceTravelled = 0;
        
        while (mainTank >= 5){
            distanceTravelled += 50;
            mainTank -= 5;
            if (additionalTank > 0){
                additionalTank -= 1;
                mainTank += 1;
            }
        }

        distanceTravelled += mainTank * 10;
        return distanceTravelled;
    }
};