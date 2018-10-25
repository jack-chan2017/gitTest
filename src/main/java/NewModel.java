import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @Title: gitTest2
 * @Description:
 * @Autor: Yu Chen
 * @Date: 2018/10/25 0025 下午 2:23
 * @Version: 1.0
 */
public class NewModel {
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String name;

    private String sex;
    public NewModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
