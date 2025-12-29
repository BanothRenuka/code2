<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>John Doe | Web Developer Portfolio</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&family=Raleway:wght@300;400;500;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
    <style>
        :root {
            --primary-color: #4a6fa5;
            --secondary-color: #166088;
            --accent-color: #ff6b6b;
            --light-color: #f8f9fa;
            --dark-color: #333;
            --gray-color: #6c757d;
            --shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
            --transition: all 0.3s ease;
        }
        
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        
        html {
            scroll-behavior: smooth;
        }
        
        body {
            font-family: 'Poppins', sans-serif;
            line-height: 1.6;
            color: var(--dark-color);
            background-color: #fff;
        }
        
        h1, h2, h3, h4 {
            font-family: 'Raleway', sans-serif;
            font-weight: 700;
            margin-bottom: 15px;
            color: var(--secondary-color);
        }
        
        a {
            text-decoration: none;
            color: inherit;
        }
        
        ul {
            list-style: none;
        }
        
        .container {
            width: 90%;
            max-width: 1200px;
            margin: 0 auto;
            padding: 0 15px;
        }
        
        .section {
            padding: 80px 0;
        }
        
        .section-title {
            text-align: center;
            margin-bottom: 50px;
            position: relative;
        }
        
        .section-title::after {
            content: '';
            position: absolute;
            width: 70px;
            height: 4px;
            background-color: var(--accent-color);
            bottom: -10px;
            left: 50%;
            transform: translateX(-50%);
        }
        
        .btn {
            display: inline-block;
            padding: 12px 28px;
            background-color: var(--primary-color);
            color: white;
            border-radius: 5px;
            font-weight: 500;
            transition: var(--transition);
            border: none;
            cursor: pointer;
            font-size: 1rem;
        }
        
        .btn:hover {
            background-color: var(--secondary-color);
            transform: translateY(-3px);
            box-shadow: var(--shadow);
        }
        
        .btn-accent {
            background-color: var(--accent-color);
        }
        
        .btn-accent:hover {
            background-color: #ff5252;
        }
        
        /* Header & Navigation */
        header {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            background-color: rgba(255, 255, 255, 0.95);
            box-shadow: var(--shadow);
            z-index: 1000;
            transition: var(--transition);
        }
        
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px 0;
        }
        
        .logo {
            font-size: 1.8rem;
            font-weight: 700;
            color: var(--secondary-color);
        }
        
        .logo span {
            color: var(--accent-color);
        }
        
        .nav-links {
            display: flex;
        }
        
        .nav-links li {
            margin-left: 30px;
        }
        
        .nav-links a {
            font-weight: 500;
            position: relative;
        }
        
        .nav-links a::after {
            content: '';
            position: absolute;
            width: 0;
            height: 2px;
            background-color: var(--accent-color);
            bottom: -5px;
            left: 0;
            transition: var(--transition);
        }
        
        .nav-links a:hover::after {
            width: 100%;
        }
        
        .hamburger {
            display: none;
            cursor: pointer;
            font-size: 1.5rem;
            color: var(--secondary-color);
        }
        
        /* Hero Section */
        .hero {
            height: 100vh;
            display: flex;
            align-items: center;
            background: linear-gradient(rgba(255, 255, 255, 0.9), rgba(255, 255, 255, 0.9)), 
                        url('https://images.unsplash.com/photo-1516321318423-f06f85e504b3?ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80');
            background-size: cover;
            background-position: center;
        }
        
        .hero-content {
            max-width: 650px;
        }
        
        .hero h1 {
            font-size: 3.5rem;
            margin-bottom: 10px;
            color: var(--dark-color);
        }
        
        .hero h2 {
            font-size: 1.8rem;
            margin-bottom: 20px;
            color: var(--primary-color);
        }
        
        .hero p {
            font-size: 1.1rem;
            margin-bottom: 30px;
            color: var(--gray-color);
        }
        
        .social-links {
            display: flex;
            margin-top: 30px;
        }
        
        .social-links a {
            display: flex;
            align-items: center;
            justify-content: center;
            width: 40px;
            height: 40px;
            background-color: var(--light-color);
            border-radius: 50%;
            margin-right: 15px;
            color: var(--primary-color);
            transition: var(--transition);
        }
        
        .social-links a:hover {
            background-color: var(--primary-color);
            color: white;
            transform: translateY(-5px);
        }
        
        /* About Section */
        .about-content {
            display: grid;
            grid-template-columns: 1fr 2fr;
            gap: 50px;
            align-items: center;
        }
        
        .about-img {
            position: relative;
        }
        
        .about-img img {
            width: 100%;
            border-radius: 10px;
            box-shadow: var(--shadow);
        }
        
        .skills {
            display: flex;
            flex-wrap: wrap;
            gap: 15px;
            margin-top: 30px;
        }
        
        .skill {
            background-color: var(--light-color);
            padding: 8px 20px;
            border-radius: 30px;
            font-weight: 500;
            transition: var(--transition);
        }
        
        .skill:hover {
            background-color: var(--primary-color);
            color: white;
            transform: translateY(-3px);
        }
        
        /* Projects Section */
        .projects {
            background-color: #f8f9fa;
        }
        
        .projects-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
            gap: 30px;
        }
        
        .project-card {
            background-color: white;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: var(--shadow);
            transition: var(--transition);
        }
        
        .project-card:hover {
            transform: translateY(-10px);
            box-shadow: 0 15px 30px rgba(0, 0, 0, 0.15);
        }
        
        .project-img {
            height: 200px;
            overflow: hidden;
        }
        
        .project-img img {
            width: 100%;
            height: 100%;
            object-fit: cover;
            transition: var(--transition);
        }
        
        .project-card:hover .project-img img {
            transform: scale(1.1);
        }
        
        .project-info {
            padding: 25px;
        }
        
        .project-info h3 {
            margin-bottom: 10px;
        }
        
        .project-info p {
            color: var(--gray-color);
            margin-bottom: 15px;
        }
        
        .project-tech {
            display: flex;
            flex-wrap: wrap;
            gap: 10px;
            margin-bottom: 20px;
        }
        
        .project-tech span {
            background-color: var(--light-color);
            padding: 5px 10px;
            border-radius: 5px;
            font-size: 0.8rem;
        }
        
        /* Resume Section */
        .resume-content {
            display: grid;
            grid-template-columns: 2fr 1fr;
            gap: 50px;
        }
        
        .timeline {
            position: relative;
            padding-left: 30px;
        }
        
        .timeline::before {
            content: '';
            position: absolute;
            left: 7px;
            top: 0;
            height: 100%;
            width: 2px;
            background-color: var(--primary-color);
        }
        
        .timeline-item {
            position: relative;
            margin-bottom: 40px;
        }
        
        .timeline-item::before {
            content: '';
            position: absolute;
            left: -38px;
            top: 5px;
            width: 12px;
            height: 12px;
            border-radius: 50%;
            background-color: var(--accent-color);
        }
        
        .timeline-date {
            font-weight: 500;
            color: var(--primary-color);
            margin-bottom: 5px;
        }
        
        .education-item, .experience-item {
            margin-bottom: 25px;
        }
        
        /* Contact Section */
        .contact {
            background-color: #f8f9fa;
        }
        
        .contact-content {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 50px;
        }
        
        .contact-info {
            display: flex;
            flex-direction: column;
            gap: 25px;
        }
        
        .contact-item {
            display: flex;
            align-items: center;
        }
        
        .contact-icon {
            width: 50px;
            height: 50px;
            background-color: var(--primary-color);
            color: white;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            margin-right: 15px;
            font-size: 1.2rem;
        }
        
        .contact-form input,
        .contact-form textarea {
            width: 100%;
            padding: 15px;
            margin-bottom: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-family: 'Poppins', sans-serif;
        }
        
        .contact-form textarea {
            height: 150px;
            resize: vertical;
        }
        
        /* Footer */
        footer {
            background-color: var(--secondary-color);
            color: white;
            padding: 30px 0;
            text-align: center;
        }
        
        .footer-content {
            display: flex;
            justify-content: space-between;
            align-items: center;
            flex-wrap: wrap;
        }
        
        .footer-links {
            display: flex;
            gap: 20px;
        }
        
        .footer-links a:hover {
            color: var(--accent-color);
        }
        
        .copyright {
            margin-top: 20px;
            width: 100%;
            color: rgba(255, 255, 255, 0.7);
            font-size: 0.9rem;
        }
        
        /* Responsive Design */
        @media (max-width: 992px) {
            .about-content,
            .resume-content {
                grid-template-columns: 1fr;
            }
            
            .hero h1 {
                font-size: 2.8rem;
            }
        }
        
        @media (max-width: 768px) {
            .hamburger {
                display: block;
            }
            
            .nav-links {
                position: fixed;
                top: 80px;
                left: -100%;
                width: 100%;
                flex-direction: column;
                background-color: white;
                text-align: center;
                transition: var(--transition);
                box-shadow: var(--shadow);
                padding: 20px 0;
            }
            
            .nav-links.active {
                left: 0;
            }
            
            .nav-links li {
                margin: 15px 0;
            }
            
            .hero h1 {
                font-size: 2.4rem;
            }
            
            .hero h2 {
                font-size: 1.5rem;
            }
            
            .footer-content {
                flex-direction: column;
                gap: 20px;
            }
        }
        
        @media (max-width: 576px) {
            .section {
                padding: 60px 0;
            }
            
            .hero h1 {
                font-size: 2rem;
            }
            
            .projects-grid {
                grid-template-columns: 1fr;
            }
        }
    </style>
</head>
<body>
    <!-- Header & Navigation -->
    <header>
        <div class="container">
            <nav class="navbar">
                <a href="#" class="logo">Port<span>folio</span></a>
                
                <ul class="nav-links">
                    <li><a href="#home">Home</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#projects">Projects</a></li>
                    <li><a href="#resume">Resume</a></li>
                    <li><a href="#contact">Contact</a></li>
                </ul>
                
                <div class="hamburger">
                    <i class="fas fa-bars"></i>
                </div>
            </nav>
        </div>
    </header>

    <!-- Hero Section -->
    <section id="home" class="hero">
        <div class="container">
            <div class="hero-content animate__animated animate__fadeInUp">
                <h1>John Doe</h1>
                <h2>Web Developer & UI/UX Designer</h2>
                <p>I create beautiful, functional websites and applications with clean code and user-centered design. With 5+ years of experience in web development, I bring ideas to life through technology.</p>
                <div class="hero-buttons">
                    <a href="#projects" class="btn">View My Work</a>
                    <a href="#contact" class="btn btn-accent">Get In Touch</a>
                </div>
                <div class="social-links">
                    <a href="#"><i class="fab fa-github"></i></a>
                    <a href="#"><i class="fab fa-linkedin"></i></a>
                    <a href="#"><i class="fab fa-twitter"></i></a>
                    <a href="#"><i class="fab fa-codepen"></i></a>
                </div>
            </div>
        </div>
    </section>

    <!-- About Section -->
    <section id="about" class="section">
        <div class="container">
            <h2 class="section-title">About Me</h2>
            <div class="about-content">
                <div class="about-img">
                    <img src="https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80" alt="John Doe">
                </div>
                <div class="about-text">
                    <p>Hello! I'm John, a passionate web developer based in San Francisco. I specialize in creating dynamic, responsive websites and applications that provide excellent user experiences.</p>
                    <p>My journey in web development started 5 years ago, and since then I've worked with various technologies and frameworks to deliver high-quality digital solutions for clients across different industries.</p>
                    <p>When I'm not coding, you can find me hiking, reading tech blogs, or experimenting with new frameworks and libraries.</p>
                    
                    <h3>My Skills</h3>
                    <div class="skills">
                        <div class="skill">HTML5</div>
                        <div class="skill">CSS3</div>
                        <div class="skill">JavaScript</div>
                        <div class="skill">React</div>
                        <div class="skill">Node.js</div>
                        <div class="skill">Python</div>
                        <div class="skill">UI/UX Design</div>
                        <div class="skill">Responsive Design</div>
                        <div class="skill">Git</div>
                        <div class="skill">MongoDB</div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Projects Section -->
    <section id="projects" class="section projects">
        <div class="container">
            <h2 class="section-title">My Projects</h2>
            <div class="projects-grid">
                <div class="project-card">
                    <div class="project-img">
                        <img src="https://images.unsplash.com/photo-1551650975-87deedd944c3?ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80" alt="E-commerce Website">
                    </div>
                    <div class="project-info">
                        <h3>E-commerce Platform</h3>
                        <p>A full-featured e-commerce website with shopping cart, user authentication, and payment integration.</p>
                        <div class="project-tech">
                            <span>React</span>
                            <span>Node.js</span>
                            <span>MongoDB</span>
                            <span>Stripe API</span>
                        </div>
                        <a href="#" class="btn">View Project</a>
                    </div>
                </div>
                
                <div class="project-card">
                    <div class="project-img">
                        <img src="https://images.unsplash.com/photo-1551288049-bebda4e38f71?ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80" alt="Task Management App">
                    </div>
                    <div class="project-info">
                        <h3>Task Management App</h3>
                        <p>A productivity application for managing tasks, projects, and team collaboration with real-time updates.</p>
                        <div class="project-tech">
                            <span>Vue.js</span>
                            <span>Firebase</span>
                            <span>SCSS</span>
                        </div>
                        <a href="#" class="btn">View Project</a>
                    </div>
                </div>
                
                <div class="project-card">
                    <div class="project-img">
                        <img src="https://images.unsplash.com/photo-1558618666-fcd25c85cd64?ixlib=rb-1.2.1&auto=format&fit=crop&w-1350&q=80" alt="Weather Dashboard">
                    </div>
                    <div class="project-info">
                        <h3>Weather Dashboard</h3>
                        <p>A responsive weather application that displays current conditions and forecasts for multiple cities.</p>
                        <div class="project-tech">
                            <span>JavaScript</span>
                            <span>API Integration</span>
                            <span>Bootstrap</span>
                        </div>
                        <a href="#" class="btn">View Project</a>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Resume Section -->
    <section id="resume" class="section">
        <div class="container">
            <h2 class="section-title">Resume & Experience</h2>
            <div class="resume-content">
                <div class="experience">
                    <h3>Work Experience</h3>
                    <div class="timeline">
                        <div class="timeline-item">
                            <div class="timeline-date">2020 - Present</div>
                            <h4>Senior Web Developer</h4>
                            <p>TechSolutions Inc., San Francisco, CA</p>
                            <p>Lead development of client projects, mentor junior developers, and implement modern web technologies to improve performance and user experience.</p>
                        </div>
                        <div class="timeline-item">
                            <div class="timeline-date">2018 - 2020</div>
                            <h4>Frontend Developer</h4>
                            <p>Digital Creations Agency, San Jose, CA</p>
                            <p>Developed responsive websites and web applications using React, JavaScript, and modern CSS techniques for various clients.</p>
                        </div>
                        <div class="timeline-item">
                            <div class="timeline-date">2016 - 2018</div>
                            <h4>Web Developer Intern</h4>
                            <p>StartUp Innovations, Mountain View, CA</p>
                            <p>Assisted in developing and maintaining company websites, learned modern web development practices, and collaborated with design team.</p>
                        </div>
                    </div>
                </div>
                
                <div class="education">
                    <h3>Education</h3>
                    <div class="education-item">
                        <h4>Bachelor of Science in Computer Science</h4>
                        <p>Stanford University, 2012 - 2016</p>
                        <p>Graduated with Honors, GPA: 3.8/4.0</p>
                    </div>
                    <div class="education-item">
                        <h4>Web Development Bootcamp</h4>
                        <p>Code Academy, 2017</p>
                        <p>Full-stack web development intensive program</p>
                    </div>
                    
                    <div class="resume-download">
                        <a href="#" class="btn btn-accent"><i class="fas fa-download"></i> Download Resume</a>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Contact Section -->
    <section id="contact" class="section contact">
        <div class="container">
            <h2 class="section-title">Get In Touch</h2>
            <div class="contact-content">
                <div class="contact-info">
                    <div class="contact-item">
                        <div class="contact-icon">
                            <i class="fas fa-map-marker-alt"></i>
                        </div>
                        <div>
                            <h4>Location</h4>
                            <p>San Francisco, California</p>
                        </div>
                    </div>
                    <div class="contact-item">
                        <div class="contact-icon">
                            <i class="fas fa-envelope"></i>
                        </div>
                        <div>
                            <h4>Email</h4>
                            <p>hello@johndoe.com</p>
                        </div>
                    </div>
                    <div class="contact-item">
                        <div class="contact-icon">
                            <i class="fas fa-phone"></i>
                        </div>
                        <div>
                            <h4>Phone</h4>
                            <p>+1 (555) 123-4567</p>
                        </div>
                    </div>
                    <div class="contact-item">
                        <div class="contact-icon">
                            <i class="fas fa-clock"></i>
                        </div>
                        <div>
                            <h4>Availability</h4>
                            <p>Available for freelance projects</p>
                        </div>
                    </div>
                </div>
                
                <div class="contact-form">
                    <form id="contactForm">
                        <input type="text" placeholder="Your Name" required>
                        <input type="email" placeholder="Your Email" required>
                        <input type="text" placeholder="Subject" required>
                        <textarea placeholder="Your Message" required></textarea>
                        <button type="submit" class="btn btn-accent">Send Message</button>
                    </form>
                </div>
            </div>
        </div>
    </section>

    <!-- Footer -->
    <footer>
        <div class="container">
            <div class="footer-content">
                <div class="footer-logo">
                    <a href="#" class="logo">Port<span>folio</span></a>
                </div>
                <div class="footer-links">
                    <a href="#home">Home</a>
                    <a href="#about">About</a>
                    <a href="#projects">Projects</a>
                    <a href="#resume">Resume</a>
                    <a href="#contact">Contact</a>
                </div>
                <div class="social-links">
                    <a href="#"><i class="fab fa-github"></i></a>
                    <a href="#"><i class="fab fa-linkedin"></i></a>
                    <a href="#"><i class="fab fa-twitter"></i></a>
                    <a href="#"><i class="fab fa-codepen"></i></a>
                </div>
                <div class="copyright">
                    <p>&copy; 2023 John Doe. All rights reserved.</p>
                </div>
            </div>
        </div>
    </footer>

    <script>
        // Mobile Navigation Toggle
        const hamburger = document.querySelector('.hamburger');
        const navLinks = document.querySelector('.nav-links');
        
        hamburger.addEventListener('click', () => {
            navLinks.classList.toggle('active');
            hamburger.querySelector('i').classList.toggle('fa-bars');
            hamburger.querySelector('i').classList.toggle('fa-times');
        });
        
        // Close mobile menu when clicking on a link
        document.querySelectorAll('.nav-links a').forEach(link => {
            link.addEventListener('click', () => {
                navLinks.classList.remove('active');
                hamburger.querySelector('i').classList.add('fa-bars');
                hamburger.querySelector('i').classList.remove('fa-times');
            });
        });
        
        // Form submission
        document.getElementById('contactForm').addEventListener('submit', function(e) {
            e.preventDefault();
            alert('Thank you for your message! I will get back to you soon.');
            this.reset();
        });
        
        // Add shadow to header on scroll
        window.addEventListener('scroll', () => {
            const header = document.querySelector('header');
            if (window.scrollY > 50) {
                header.style.boxShadow = '0 5px 20px rgba(0, 0, 0, 0.1)';
            } else {
                header.style.boxShadow = '0 5px 15px rgba(0, 0, 0, 0.1)';
            }
        });
        
        // Smooth scrolling for anchor links
        document.querySelectorAll('a[href^="#"]').forEach(anchor => {
            anchor.addEventListener('click', function(e) {
                e.preventDefault();
                
                const targetId = this.getAttribute('href');
                if(targetId === '#') return;
                
                const targetElement = document.querySelector(targetId);
                if(targetElement) {
                    window.scrollTo({
                        top: targetElement.offsetTop - 80,
                        behavior: 'smooth'
                    });
                }
            });
        });
        
        // Animate elements on scroll
        const observerOptions = {
            threshold: 0.1,
            rootMargin: '0px 0px -50px 0px'
        };
        
        const observer = new IntersectionObserver((entries) => {
            entries.forEach(entry => {
                if(entry.isIntersecting) {
                    entry.target.classList.add('animate__animated', 'animate__fadeInUp');
                }
            });
        }, observerOptions);
        
        // Observe elements to animate
        document.querySelectorAll('.project-card, .about-text, .timeline-item, .education-item, .contact-item').forEach(el => {
            observer.observe(el);
        });
    </script>
</body>
</html>