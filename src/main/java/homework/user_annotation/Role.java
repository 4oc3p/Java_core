package homework.user_annotation;

/**
 * Created by 4oc3p on 27.04.2017. Java_core
 */
public enum Role {
    ADMIN(true, true, true), SUPERUSER(true, true), USER(true);

    private boolean read;
    private boolean write;
    private boolean execute;

    Role(boolean read) {
        this.read = read;
    }

    Role(boolean read, boolean write) {
        this(read);
        this.write = write;
    }

    Role(boolean read, boolean write, boolean execute) {
        this(read, write);
        this.execute = execute;
    }

    @Override
    public String toString() {
        return "Role{" +
            "name=" + name() +
            ", read=" + read +
            ", write=" + write +
            ", execute=" + execute +
            '}';
    }
}
