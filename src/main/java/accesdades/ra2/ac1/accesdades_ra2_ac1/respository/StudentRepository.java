package accesdades.ra2.ac1.accesdades_ra2_ac1.respository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import accesdades.ra2.ac1.accesdades_ra2_ac1.model.Student;

@Repository
public class StudentRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	private static final class StudentRowMapper implements RowMapper<Student> {
		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student = new Student();

			student.setId(rs.getLong("id"));
			student.setNom(rs.getString("nom"));
			student.setCognom(rs.getString("cognom"));
			student.setAge(rs.getInt("age"));
			student.setCicle(rs.getString("cicle"));
			student.setAny(rs.getInt("anyo"));
			
			return student;
		}
	}


	public List<Student> findAll() {
		String sql = "SELECT * FROM students";
		return jdbcTemplate.query(sql, new StudentRowMapper());
	}

	public int save(String nom, String cognom, int age, String cicle, int anyo) {
		String sql = "INSERT INTO Students (nom, cognom, age, cicle, anyo) VALUES (?,?,?,?,?)";
		return jdbcTemplate.update(sql, nom, cognom, age, cicle, anyo);
	}

}
