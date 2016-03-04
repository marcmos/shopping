package pl.maxmati.tobiasz.mmos.shopping;

import java.util.Date;

/**
 * Created by mmos on 27.02.16.
 *
 * @author mmos
 */
public class PendingOrder {
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_NORMAL = 0;
    public static final int PRIORITY_HIGH = 1;

    private final Date creationDate;
    private final String user;
    private final String name;
    private final int priority;
    private final String description;
    private final Double price;
    private final int quantity;

    public PendingOrder(Date creationDate, String user, String name, int priority, String description, Double price, int quantity) {
        this.creationDate = creationDate;
        this.user = user;
        this.name = name;
        this.priority = priority;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PendingOrder that = (PendingOrder) o;

        if (priority != that.priority) return false;
        if (quantity != that.quantity) return false;
        if (!creationDate.equals(that.creationDate)) return false;
        if (!user.equals(that.user)) return false;
        if (!name.equals(that.name)) return false;
        if (description != null ? !description.equals(that.description) : that.description != null)
            return false;
        return !(price != null ? !price.equals(that.price) : that.price != null);
    }

    @Override
    public int hashCode() {
        int result = creationDate.hashCode();
        result = 31 * result + user.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + priority;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + quantity;
        return result;
    }

    @Override
    public String toString() {
        return getName();
    }
}
