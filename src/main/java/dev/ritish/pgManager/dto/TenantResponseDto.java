package dev.ritish.pgManager.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class TenantResponseDto {

  private Long id;
  private String name;
  private String aadhar;
  private String phone;
  private String permanentAddress;
  private String profilePic;
  private LocalDate joinDate;
  private String roomNo;

}
