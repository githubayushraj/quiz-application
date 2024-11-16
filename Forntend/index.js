 function startQuiz(quizType) {
   // Starting quiz! This is our output if quizType is Java
   alert(`Starting ${quizType.charAt(0).toLowerCase() + quizType.slice(1)} quiz!`);

   // Redirect to the corresponding quiz page
   window.location.href = `${quizType.toLowerCase()}-quiz.html`; // Redirects to quizType-quiz.html
   // ye refer kr dega if example quizeType is Math then inrefer page java-Type.js page per
}
