
 Button login, register;
    EditText username, password;

    protected void onCreate(Bundle savedInstances){
        super.onCreate(savedInstances);
        setContentView(R.layout.login);
        login=(Button)findViewById(R.id.buttonlogin);
        register=(Button)findViewById(R.id.buttonregister);
        username=(EditText)findViewById(R.id.editTextusername);
        password=(EditText)findViewById(R.id.editTextpassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_name = username.getText().toString();
                String pass_word = password.getText().toString();
                if(TextUtils.isEmpty(user_name))
                {
                    username.setError("Invalid User Name");
                }
                else if (TextUtils.isEmpty(pass_word)){
                    password.setError("Enter Password");
                }




                DBAdapter dbAdapter = new DBAdapter(LoginActivity.this);
                FacultyBean facultyBean = dbAdapter.validateFaculty(user_name, pass_word);
                if (facultyBean==null){
                    Toast.makeText(getApplicationContext(), "Not Registered yet? Click Register", Toast.LENGTH_SHORT).show();
                }
                else if(facultyBean!=null)
                {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    ((ApplicationContext)LoginActivity.this.getApplicationContext()).setFacultyBean(facultyBean);
                    Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
