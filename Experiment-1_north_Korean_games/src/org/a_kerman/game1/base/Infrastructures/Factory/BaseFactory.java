package org.a_kerman.game1.base.Infrastructures.Factory;

import org.a_kerman.game1.base.Residents;
import org.a_kerman.game1.base.DeltaTime;
/**
 *
 * @author chucheloid
 */
public class BaseFactory extends Residents {
    private float time;
    private float min_cooldown = 10.0f;
    public BaseFactory(int number, double min_wage) {
        super(number, min_wage);
    }
    private float cooldown = min_cooldown - ((float) number / 2.0f);
    public double WageCycle() {
        cooldown = min_cooldown - ((float) number / 2.0f);
        time += DeltaTime.dt;
        if (time >= cooldown) {
            time = 0;
            return min_wage;
        }
        return 0;
    }
} 
