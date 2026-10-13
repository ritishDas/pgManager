package dev.ritish.pgManager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "tenant")
@Data
public class Tenant {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false, length = 12)
  private String aadhar;

  @Column(nullable = false, length = 10)
  private String phone;

  @Column(name = "parmanent_address")
  private String permanentAddress;

  @Column(name = "profile_pic")
  private String profilePic;

  @Column(name = "join_date")
  private LocalDate joinDate;

  @Column(name = "room_no")
  private String roomNo;
}
