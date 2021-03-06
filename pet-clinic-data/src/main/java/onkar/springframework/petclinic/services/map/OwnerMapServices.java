package onkar.springframework.petclinic.services.map;

import onkar.springframework.petclinic.model.Owner;
import onkar.springframework.petclinic.services.CrudServiceCommon;
import onkar.springframework.petclinic.services.OwnerServices;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerMapServices extends AbstractMapService<Owner,Long> implements OwnerServices{
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
