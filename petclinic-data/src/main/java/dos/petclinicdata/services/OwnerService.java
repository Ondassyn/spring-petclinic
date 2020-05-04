package dos.petclinicdata.services;

import dos.petclinicdata.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
