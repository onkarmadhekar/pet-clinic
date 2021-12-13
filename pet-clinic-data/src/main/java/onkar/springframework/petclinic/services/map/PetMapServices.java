package onkar.springframework.petclinic.services.map;

import onkar.springframework.petclinic.model.Pet;
import onkar.springframework.petclinic.services.CrudServiceCommon;

import java.util.Set;

public class PetMapServices extends AbstractMapService<Pet,Long> implements CrudServiceCommon<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        super.save(object.getId(),object);
        return object;
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}