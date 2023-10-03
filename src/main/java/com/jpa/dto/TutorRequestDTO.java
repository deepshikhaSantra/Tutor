package com.jpa.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TutorRequestDTO {
	// @Min(value = 0, message = "Ivalid id:Equals to zero or less than that")
	@NotBlank(message = "Invalid Title:the title is empty")
	@NotNull(message = "Invalid Title:the title is null")
	@Size(min = 5, max = 30, message = "Invalid Size:The size range must be 5-30")
	private String tittle;
	@Size(min = 10, max = 100, message = "The size range must be 10-100")
	private String description;
	// @AssertFalse(message = "Invalid input:It has to be false.")
	// @AssertTrue(message = "Invalid input:It has to be true.")
	@NotNull(message = "Invalid input:the title is null")
	private Boolean published;

}
