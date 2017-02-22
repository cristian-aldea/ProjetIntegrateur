package ca.qc.bdeb.info204.spellington.calculations;

/**
 * Custom Vector class for Physics calculations
 *
 * @author Cristian Aldea
 */
public class Vector2D {

    private float x;
    private float y;

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D(Vector2D v) {
        this.x = v.x;
        this.y = v.y;
    }

    public void set(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void set(Vector2D v) {
        this.x = v.x;
        this.y = v.y;
    }

    public void multScalar(float scalar) {
        x *= scalar;
        y *= scalar;
    }

    public static Vector2D multVectorScalar(Vector2D v, float scalar) {
        return new Vector2D(v.x * scalar, v.y * scalar);
    }

    public void add(Vector2D v) {
        x += v.x;
        y += v.y;
    }

    public void sub(Vector2D v) {
        x -= v.x;
        y -= v.y;
    }

    public void add(float x, float y) {
        this.x += x;
        this.y += y;
    }

    public float vectorLength() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public static float distance(float x1, float x2, float y1, float y2) {
        x1 -= x2;
        y1 -= y2;
        return (float) Math.sqrt(x1 * x1 + y1 * y1);
    }

    public static float distance(Vector2D v1, Vector2D v2) {
        float dx = v1.x - v2.x;
        float dy = v1.y - v2.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Vector : (" + x + "," + y + ")";
    }

}