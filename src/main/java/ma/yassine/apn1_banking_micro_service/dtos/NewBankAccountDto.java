package ma.yassine.apn1_banking_micro_service.dtos;

import lombok.Getter;
import lombok.Setter;
import ma.yassine.apn1_banking_micro_service.enums.AccountType;

@Getter @Setter
public class NewBankAccountDto {
    private String currency;
    private Double balance;
    private AccountType accountType;
}
