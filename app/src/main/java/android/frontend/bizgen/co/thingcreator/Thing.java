package android.frontend.bizgen.co.thingcreator;

import java.util.Date;

/**
 * Created by Raúl on 13/10/2016.
 */
public class Thing {
    private String name;
    private  String description;
    private Date date;
    private int id;
    private float latitude;
    private float longitude;
    private int idUsuario;

    public Thing(String name, String description, int id, float latitude, float longitude, int idUsuario) {
        this.name = name;
        this.description = description;
       // this.date = date;
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.idUsuario = idUsuario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
