package org.a_kerman.game1.base;
/**
 *
 * @author chucheloid
 */
public class DeltaTime {
    public static float dt = 0.0f;
    public static long lastime = System.nanoTime();
    public static void UpdateTime() {
        dt = (float) ((System.nanoTime() - lastime) / 1e9); lastime = System.nanoTime();
    }

}
