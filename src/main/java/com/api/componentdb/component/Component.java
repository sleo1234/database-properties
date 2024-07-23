package com.api.componentdb.component;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "component")

public class Component {





    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(unique = true, nullable = false)
    private String name;

    @Column
    private Double MOLE_WT;

    @Column
    private Double Tc;

    @Column
    private Double Pc;
    @Column
    private Double Vc;
    @Column
    private Double Zc;

    @Column
    private Double omega;
    @Column
    private Double CpA;
    @Column
    private Double CpB;
    @Column
    private Double CpC;
    @Column
    private Double CpD;

    @Column
    private Double PVAPA;
    @Column
    private Double PVAPB;
    @Column
    private Double PVAPC;


    @Override
    public String toString() {
        return "Component{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", MOLE_WT=" + MOLE_WT +
                ", Tc=" + Tc +
                ", Pc=" + Pc +
                ", Vc=" + Vc +
                ", Zc=" + Zc +
                ", omega=" + omega +
                ", CpA=" + CpA +
                ", CpB=" + CpB +
                ", CpC=" + CpC +
                ", CpD=" + CpD +
                ", PVAPA=" + PVAPA +
                ", PVAPB=" + PVAPB +
                ", PVAPC=" + PVAPC +
                '}';
    }
}
