var BIKELANE = {};

$(function() {
  $(document).keyup(function(e) {
    if (e.keyCode == 39) BIKELANE.switchToAgency();
  })
});

BIKELANE.switchToAgency = function() {
  window.scrollTo(0,0);
  $('.introduction h1').text(
    'Simple, comprehensive small business insurance for Web Agencies'
  )
  $('.introduction h1').css({ color: '#444' });
  $('.navbar').css({ 'background-color': '#1a235e' });
  $('.navbar-dark .navbar-nav .nav-link').css({ color: 'white' });
  $('.background').css({ 'background-color': 'white' });
  $('.primary-image').prop('src', './images/agencies_primary.png');
  $('.hero-intro').css({ 'background-color': '#2c387f' });
  $('.hero-intro h2').text(
    'Learn why Pivotal Labs recommends Bike Lane for Web Agencies'
  )
  $('.common-hero .top-paragraph').text(
    'You have code to write, sprints to finish and production fires to fight.'
  )
  $('.common-hero .bottom-paragraph').text(
    'Fortunately Bike Lane offers an insurance program specifically for ' +
      'freelance web developers and agencies that covers industry-specific ' +
      'concerns. Think data loss, intrusions and coffee on the keyboard. ' +
      'Fill out a few question and get a policy in a matter of minutes.'
  )
  $('h1,h2,h3,h4,p').css({ 'font-family': 'Helvetica Neue' });
};
