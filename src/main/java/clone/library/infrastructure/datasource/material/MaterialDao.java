package clone.library.infrastructure.datasource.material;

import clone.library.domain.model.material.entry.Entry;
import clone.library.domain.model.material.entry.Keyword;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface MaterialDao {

    @Select
    List<Entry> searchMaterials(Keyword keyword);
}
