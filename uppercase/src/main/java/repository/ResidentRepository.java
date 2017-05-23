package repository;
import domain.Resident;
import java.util.List;


/**
 * @author Stefan Betermieux
 */
public interface ResidentRepository {

  List<Resident> getResidents();

}