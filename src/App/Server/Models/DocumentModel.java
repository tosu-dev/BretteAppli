package App.Server.Models;

import App.Server.Entities.Dvd;
import App.Server.Entities.Entity;

import java.lang.reflect.InvocationTargetException;

public class DocumentModel extends Model {

    public DocumentModel() {
        super();
    }

    @Override
    public String getTableName() {
        return "document";
    }

    @Override
    public Entity getEntityInstance() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> dvdClass = Dvd.class;
        return (Entity) dvdClass.getConstructor().newInstance();
    }
}
