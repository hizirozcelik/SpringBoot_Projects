package ca.sheridancollege.ozcelikh.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 
 * @author Hizir Ozcelik, January 2022
 */

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
	
	private Long userId;
	private String name;
	private String lastName;
	private String address;
	private String phone;
	@NonNull
	private String email;
	@NonNull
	private String encryptedPassword;
	@NonNull
	private Boolean enabled;


}
