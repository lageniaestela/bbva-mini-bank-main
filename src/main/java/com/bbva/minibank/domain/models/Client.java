package com.bbva.minibank.domain.models;

import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {

  private UUID id;
  private String lastName;
  private String firstName;
  private String email;
  private String phone;
  private String address;
  private List<Account> accounts;
  private Client coHolder;

}
