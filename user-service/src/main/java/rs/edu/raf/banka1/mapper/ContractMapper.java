package rs.edu.raf.banka1.mapper;

import org.springframework.stereotype.Component;
import rs.edu.raf.banka1.dtos.ContractCreateDto;
import rs.edu.raf.banka1.model.Contract;

@Component
public class ContractMapper {
    public Contract contractCreateDtoToContract(ContractCreateDto contractCreateDto, Long buyerId) {
        Contract contract = new Contract();
//        contract.set
        return null;
    }
}
