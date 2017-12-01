package org.fbz.gemini.service.finance;

import java.util.List;

import org.fbz.gemini.domain.finance.Finance;
import org.fbz.gemini.domain.finance.FinanceQuery;
import org.springframework.data.domain.Page;

public interface FinanceService {
    Page<Finance> list(FinanceQuery finance);
    
    List<Finance> listAll();
    
    Finance get(String id);
    
    boolean save(Finance finance);
    
    boolean update(Finance finance);
    boolean updateResidue(double finance, String id, Integer type);
    
    boolean batchRemove(String[] ids);
    
    boolean isExistedName(String name);
}
