package dev.ritish.pgManager.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TenantRequestDto {

  @NotBlank(message = "Name is required")
  private String name;

  @NotBlank(message = "Aadhaar number is required")
  @Pattern(regexp = "^[2-9]\\d{11}$", message = "Aadhaar number must be a valid 12-digit number")
  private String aadhar;

  @NotBlank(message = "Phone number is required")
  @Pattern(regexp = "^[6-9]\\d{9}$", message = "Phone number must be a valid 10-digit Indian mobile number")
  private String phone;

  @NotBlank(message = "Permanent address is required")
  private String permanentAddress;

  @NotNull(message = "Join date is required")
  @PastOrPresent(message = "Join date cannot be in the future")
  private LocalDate joinDate;

  @NotBlank(message = "Room number is required")
  @Size(max = 20, message = "Room number must not exceed 20 characters")
  private String roomNo;

}
