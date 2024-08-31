class Solution {

    public double radius;
    public double x_center;
    public double y_center;

    public Solution(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }
    
    public double[] randPoint() {
        double[] array = new double[2];
        double rad = (radius*Math.sqrt(Math.random()));
        double angle = Math.random()*2*Math.PI;
        array[0] = x_center + (rad)*Math.cos(angle);
        array[1] = y_center + (rad)*Math.sin(angle);
        return array;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */
