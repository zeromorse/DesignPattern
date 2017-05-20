package N07_prototype.code.impl;

import N07_prototype.code.Prototype;

import java.io.*;

/**
 * 具体原型角色
 *
 * @author Zero
 * @created 2017/4/24 9:17
 */
public class ConcretePrototype implements Prototype, Serializable {
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Object deepClone() {
        // 将对象写入流中
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 将对象从流里读出出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        try {
            ObjectInputStream oi = new ObjectInputStream(bi);
            return oi.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static final long serialVersionUID = 1L;
}
