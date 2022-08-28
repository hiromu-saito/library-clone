package clone.library.infrastructure.datasource.material;

import clone.library.application.service.material.MaterialRepository;
import clone.library.domain.model.material.entry.Entries;
import clone.library.domain.model.material.entry.Entry;
import clone.library.domain.model.material.entry.EntryNumber;
import clone.library.domain.model.material.entry.Keyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MaterialDataSource implements MaterialRepository {
    MaterialDao materialDao;

    @Autowired
    MaterialDataSource(MaterialDao materialDao) {
        this.materialDao = materialDao;
    }

    @Override
    public Entries search(Keyword keyword) {
        //ドメインオブジェクト側で非nullを担保する
        // Assert.notNull(keyword ,"keyWord must not be null");
        List<Entry> materials = materialDao.searchMaterials(keyword);
        return new Entries(materials);
    }

    @Override
    public Optional<Entry> findMaterial(final EntryNumber entryNumber) {
        return materialDao.selectMaterial(entryNumber);
    }
}
