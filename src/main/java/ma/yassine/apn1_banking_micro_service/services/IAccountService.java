package ma.yassine.apn1_banking_micro_service.services;

import ma.yassine.apn1_banking_micro_service.dtos.InfoBankAccountDto;
import ma.yassine.apn1_banking_micro_service.dtos.NewBankAccountDto;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

public interface IAccountService {
    List<InfoBankAccountDto> getAllBankAccounts();

    InfoBankAccountDto getBankAccountById(UUID id);

    @Transactional
    ResponseEntity<String> deleteBankAccountById(UUID id);

    @Transactional
    InfoBankAccountDto createBankAccount(NewBankAccountDto bankAccountDto);

    @Transactional
    InfoBankAccountDto updateBankAccount(InfoBankAccountDto bankAccountDto);

    @Transactional
    InfoBankAccountDto updateBankAccount(NewBankAccountDto bankAccountDto, UUID id);

    InfoBankAccountDto getAccountById(UUID id);
}
