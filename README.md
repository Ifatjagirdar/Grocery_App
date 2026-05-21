# 🛒 Grocery Shopping App

[![Python](https://img.shields.io/badge/Python-3.8%2B-blue)](https://python.org)
[![Flask](https://img.shields.io/badge/Flask-2.0%2B-green)](https://flask.palletsprojects.com)
[![SQLite](https://img.shields.io/badge/Database-SQLite-lightblue)](https://sqlite.org)
[![License](https://img.shields.io/badge/License-MIT-lightgrey)](LICENSE)

> Full-stack grocery shopping web application with user authentication, shopping cart, and order management

---

## 🎯 About

A complete e-commerce web application for online grocery shopping. Users can browse products, add items to cart, place orders, and track their purchase history. Built with Flask backend and responsive frontend.

**Perfect for:** Local grocery stores, small businesses, or learning full-stack web development

---

## ✨ Features

### Customer Features
- ✅ User registration and authentication
- ✅ Browse grocery products by category
- ✅ Search functionality
- ✅ Shopping cart management (add, update, remove items)
- ✅ Order placement and checkout
- ✅ Order history tracking
- ✅ User profile management

### Admin Features
- ✅ Product management (add, edit, delete products)
- ✅ Category management
- ✅ Order management and tracking
- ✅ User management
- ✅ Inventory tracking

---

**Tech Stack:**
- **Backend:** Flask (Python web framework)
- **Database:** SQLite (easily upgradable to PostgreSQL/MySQL)
- **Frontend:** HTML5, CSS3, JavaScript
- **Authentication:** Flask-Login
- **Forms:** Flask-WTF

---

## 🚀 Quick Start

### Prerequisites
```bash
Python 3.8 or higher
pip (Python package manager)
```

### Installation

```bash
# Clone the repository
git clone https://github.com/Ifatjagirdar/Grocery_App.git
cd Grocery_App

# Create virtual environment (recommended)
python -m venv venv

# Activate virtual environment
# On Windows:
venv\Scripts\activate
# On macOS/Linux:
source venv/bin/activate

# Install dependencies
pip install -r requirements.txt

# Initialize the database
python init_db.py

# Run the application
python app.py
```

### Access the Application
- **User Interface:** `http://localhost:5000`
- **Admin Panel:** `http://localhost:5000/admin`

Default admin credentials:
- Username: `admin`
- Password: `admin123` *(Change after first login)*

---

## 📂 Project Structure
Grocery_App/
├── app.py                 # Main application file
├── models.py              # Database models
├── forms.py               # WTForms definitions
├── config.py              # Configuration settings
├── init_db.py             # Database initialization
├── requirements.txt       # Python dependencies
├── static/
│   ├── css/              # Stylesheets
│   ├── js/               # JavaScript files
│   └── images/           # Product images
├── templates/
│   ├── index.html        # Homepage
│   ├── products.html     # Product listing
│   ├── cart.html         # Shopping cart
│   ├── checkout.html     # Checkout page
│   ├── orders.html       # Order history
│   └── admin/            # Admin templates
└── README.md

---

## 🛠️ Technologies Used

**Backend:**
- Flask 2.0+
- Flask-SQLAlchemy (ORM)
- Flask-Login (Authentication)
- Flask-WTF (Forms)
- Werkzeug (Password hashing)

**Frontend:**
- HTML5
- CSS3 (Responsive design)
- JavaScript (ES6+)
- Bootstrap 5 (UI framework)

**Database:**
- SQLite (Development)
- PostgreSQL ready (Production)

---

## 📊 Database Schema

### Tables:
- **Users** — Customer accounts
- **Products** — Grocery items
- **Categories** — Product categories
- **Cart** — Shopping cart items
- **Orders** — Placed orders
- **OrderItems** — Individual items in orders

---



## 🔐 Security Features

- ✅ Password hashing with Werkzeug
- ✅ Session management with Flask-Login
- ✅ CSRF protection with Flask-WTF
- ✅ SQL injection prevention (SQLAlchemy ORM)
- ✅ Input validation and sanitization

---

## 🚀 Deployment

### Heroku Deployment
```bash
# Install Heroku CLI
# Login to Heroku
heroku login

# Create new app
heroku create your-grocery-app

# Add PostgreSQL
heroku addons:create heroku-postgresql:hobby-dev

# Deploy
git push heroku main

# Run migrations
heroku run python init_db.py
```

### Docker Deployment
```bash
# Build image
docker build -t grocery-app .

# Run container
docker run -p 5000:5000 grocery-app
```

---

## 🔮 Future Enhancements

- [ ] Payment gateway integration (Razorpay, Stripe)
- [ ] Email notifications for orders
- [ ] Product reviews and ratings
- [ ] Wishlist functionality
- [ ] Real-time inventory updates
- [ ] Mobile app (React Native)
- [ ] Multi-vendor support
- [ ] Coupon/discount system
- [ ] Delivery tracking
- [ ] Multi-language support (Hindi, regional languages)

---

## 🤝 Contributing

Contributions welcome! Here's how you can help:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

**Areas for contribution:**
- UI/UX improvements
- Performance optimization
- Security enhancements
- New features
- Bug fixes
- Documentation

---

## 🐛 Known Issues

- Pagination needed for large product catalogs
- Mobile responsiveness needs improvement on some pages


*(Check [Issues](https://github.com/Ifatjagirdar/Grocery_App/issues) for more)*



## 🙏 Acknowledgments

- Flask documentation and community
- Bootstrap for UI components
- SQLAlchemy for database ORM
- Inspiration from modern e-commerce platforms

---

## 📧 Contact

**Ifat Jagirdar**  
BTech Computer Engineering | SNDT Women's University, Mumbai  

📧 Email: [syedifat2002@gmail.com]  
🔗 LinkedIn: [www.linkedin.com/in/ifat-jagirdar-43679222a]  

---

## 💡 Learning Outcomes

This project demonstrates:
- Full-stack web development
- RESTful API design
- Database modeling and relationships
- User authentication and authorization
- E-commerce workflow implementation
- Production deployment practices


📝 **Found a bug or have suggestions?** [Open an issue](https://github.com/Ifatjagirdar/Grocery_App/issues)

