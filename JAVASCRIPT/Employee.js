const form = document.getElementById('employee-form');
const successMessage = document.getElementById('success-message');
const errorMessage = document.getElementById('error-message');

form.addEventListener('submit', (e) => {
  e.preventDefault();

  const formData = new FormData(form);
  const xhr = new XMLHttpRequest();

  xhr.onreadystatechange = function() {
    if (xhr.readyState === XMLHttpRequest.DONE) {
      if (xhr.status === 200) {
        successMessage.innerHTML = 'Employee form submitted successfully.';
        errorMessage.innerHTML = '';
        form.reset();
      } else {
        errorMessage.innerHTML = 'There was an error submitting the form.';
        successMessage.innerHTML = '';
      }
    }
  };

  xhr.open('POST', 'submit-employee-form.php', true);
  xhr.send(formData);
});