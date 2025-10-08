package accesdades.ra2.ac1.accesdades_ra2_ac1.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;


	public void findAll() {

	}

	public void save() {

	}

}
