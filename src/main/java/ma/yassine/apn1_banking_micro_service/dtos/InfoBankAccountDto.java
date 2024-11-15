package ma.yassine.apn1_banking_micro_service.dtos;

import ma.yassine.apn1_banking_micro_service.enums.AccountType;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class InfoBankAccountDto {
    private UUID id;
    private String currency;
    private Double balance;
    private AccountType accountType;
}
