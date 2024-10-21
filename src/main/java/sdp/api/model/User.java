package sdp.api.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    private Integer id_user;

    private String name;
    private String lastName;
    private String email;
    private String password;

    /* CREAR RELACIONES */
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
        name = "userrol",
        joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "id_user"),
        inverseJoinColumns = @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    )
    private List<Rol> roles;

    public User() {

    }

    public Integer getId_user() {
        return id_user;
    }
    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public List<Rol> getRoles() {
        return this.roles;
    }
    public void addRol(Rol rol) {
        this.roles.add(rol);
    }
}
