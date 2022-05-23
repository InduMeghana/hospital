	@Autowired
	Patientrepo prepo;
	@Autowired
	Doctorrepo drepo;
	@Test
	public void testCreateDoctors() {
		Doctor d=new Doctor();
		d.setId(9L);
		d.setName("padma");
		d.setAge(39);
		d.setGender("female");
		d.setSpecialization("gynachologist");
		drepo.save(d);
		java.util.Optional<Doctor> d2=drepo.findById(9L);
		assertNotNull(d2.get());
	}
	@Test
	public void testCreatePatient() {
		Patient p=new Patient();
		Date d=new Date(2323223232L);
		p.setId(5L);
		p.setName("Lata");
		p.setVisiteddoctor("padma");
		p.setDate(d);
		prepo.save(p);
		assertNotNull(prepo.findById(5L).get());
	}
	@Test
	public void testdoctlist() {
		List<Doctor> list=(List<Doctor>) drepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void testpatList() {
		List<Patient> list=(List<Patient>) prepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void testsinglrPatient() {
		Optional<Patient> p=prepo.findById(3L);
		assertEquals("Nirupam",p.get().getName());
	}
	@Test
	public void testupadateDoctor() {
		Doctor d=drepo.findById(9L).get();
		int cnt=d.getCount();
		d.setCount(cnt+1);
		drepo.save(d);
		assertNotEquals(cnt,drepo.findById(9L).get().getCount());
	}
