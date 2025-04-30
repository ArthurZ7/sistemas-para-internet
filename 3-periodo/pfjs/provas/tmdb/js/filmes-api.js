const getFilmes = async () => {
    const options = {
        method: 'GET',
        headers: {
          accept: 'application/json',
          Authorization: 'Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIzNTIwN2RjYWQ2NTdjODY0MzBkMDYzN2YxZGM5OWYzMiIsIm5iZiI6MTc0NjAxNDg1OC4xNiwic3ViIjoiNjgxMjEyOGE3ZDkzY2ExZmNlMzUzMzViIiwic2NvcGVzIjpbImFwaV9yZWFkIl0sInZlcnNpb24iOjF9.as-a7Oym_ZWpcm-ZLkBDfxHCaEzAylc7EwKGjZb9gYM'
        }
      };
      
      fetch('https://api.themoviedb.org/3/authentication', options)
        .then(res => res.json())
        .then(res => console.log(res))
        .catch(err => console.error(err));
}

export default getFilmes;
